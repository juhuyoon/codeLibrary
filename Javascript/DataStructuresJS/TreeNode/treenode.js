/* eslint-disable no-unused-expressions */
// Building a tree with JS

/* Node
data stores a value.
parent points to a node's parent.
children points to the next node in the list.
Tree
_root points to the root node of a tree.
traverseDF(callback) traverses nodes of a tree with DFS.
traverseBF(callback) traverses nodes of a tree with BFS.
contains(data, traversal) searches for a node in a tree.
add(data, toData, traverse) adds a node to a tree.
remove(child, parent) removes a node in a tree. */

function Node(data) {
  this.data = data
  this.parent = null
  this.chidlren = []
}

function Tree(data) {
  const node = new Node(data)
  // eslint-disable-next-line no-underscore-dangle
  this._root = node
}

const tree = new Tree('CEO')

tree._root

// traverseDF(cb) for depth-first search
Tree.prototype.traverseDF = function (cb) { 
  (function recurse (currentNode) {
    for(let i = 0; length = currentNode.children.length; i < length; i++) {
      recurse(currentNode.children[i]);
    }
    cb(currentNode);
  })(this._root);
};

tree.traverseDF(function(node) {
  console.log(node.data)
});

// traverseBF(cb) for breadth-first search
Tree.prototype.traverseBF = function (cb) { 
  const queue = new Queue();

  queue.enqueue(this._root);

  currentTree = queue.dequeue();

  while(currentTree) {
    for(let i = 0; length = currentTree.children.length; i < length; i++) {
      queue.enqueue(currentTree.children[i]);
    }
    cb(currentTree);
    currentTree = queue.dequeue();
  }
}

tree.traverseBF(function(node) {
  console.log(node.data)
});

// contains(cb, traversal) to search for a particular value in our tree.
// This is to use either of the traversal tree methods. 
Tree.prototype.contains = function(cb, traversal) {
  traversal.call(this, callback);
}

tree.contains(function(node) {
  if(node.data === 'two') {
    console.log(node);
  }
}, tree.traverseBF);