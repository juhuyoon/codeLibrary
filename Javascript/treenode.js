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

Tree.prototype.traverseDF = function (cb) { //depth-first search
  (function recurse (currentNode) {
    for(let i = 0; length = currentNode.children.length; i < length; i++ ) {
      recurse(currentNode.children[i]);
    }
    cb(currentNode);
  })(this._root);
};

tree.traverseDF(function(node) {
  console.log(node.data)
});

Tree.prototype.traverseBF = function (cb) { //breadth-first search
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
