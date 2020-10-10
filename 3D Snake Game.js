
function cube(vec, material, scene, geometry, renderWireFrame){
    this.geometry = typeof geometry === 'undefined' ? cube: geometry;
    this.mesh = new THREE.mesh(this.geometry, material);

    if(typeof renderWireFrame === 'undefined' || !renderWireFrame){
        this.mesh.position.set(vec.x, vec.y, vec.z);
        scene.add(this.mesh);
    }
    else{
        var edges = new THREE.EdgesGeometry(this.mesh.geometry);
        scene.add(new THREE.LineSegments(edges, material));
    }

    this.setPosition =function(vec){
        this.mesh.position.set(vec.x, vec.y, vec.z);
    }
}

function randInRange(a, b){
    return a + Math.floor((b - a) * Math.random());
}

var WIDTH = window.innerWidth, HEIGHT = window.innerHeight;
var aspectRatio = WIDTH / HEIGHT;
var renderer = new THREE.WebGLRenderer(), camera = new THREE.PerspectiveCamera(45, aspectRatio, 0.1, 1000), scene = new THREE.Scene();
var controls = new THREE.OrbitControls(camera, renderer.domElement);
controls.enableKeys = false;

var mov = 5;
var delta = 1 / mov;
var theta = 0.0, edgeSize = 20, padding = 0.15;
var cubeSize = edgeSize + (edgeSize - 1) * padding;
var halfCubeSize = cubeSize / 2;

var BACKGROUND_COLOR = 0x6200ee, BODY_COLOR = 0x388e3c, HEAD_COLOR = 0x004d40, score = 0;
var lightPos = 