var scores, roundScore, activePlayer, gamePlaying;
init();
document.querySelector('.btn-roll').addEventListener('click', function () {
    if (gamePlaying) {
        var dice = Math.floor(Math.random() * 6) + 1;
        //display the result.
        var diceDOM = document.querySelector('.dice');
        diceDOM.style.display = 'block';   //block: The element displayed as a block-level element (like paragraphs and headers)
        diceDOM.src = 'dice-' + dice + '.png';
        if (dice !== 1) {
            //Add the scores
            roundScore += dice;
            document.querySelector('#current-' + activePlayer).textContent = roundScore;
        }
        else {
            //Next Player
            nextPlayer();
        }
    }
    // display the number
});   //click is the first arguement to eventlistener
document.querySelector('.btn-hold').addEventListener('click', function () {
    if (gamePlaying) {
        //Add current score to global score
        scores[activePlayer] += roundScore;
        //Update the UI
        document.querySelector('#score-' + activePlayer).textContent = scores[activePlayer];
        //Check if player won the game
        if (scores[activePlayer] >= 100) {
            document.querySelector('#name-' + activePlayer).textContent = 'Winner';
            document.querySelector('.dice').style.display = 'none';
            document.querySelector('.player-' + activePlayer + '-panel').classList.add('winner');
            document.querySelector('.player-' + activePlayer + '-panel').classList.remove('active');
            gamePlaying = false;
        }
        else {
            nextPlayer();
        }
        //Next player
    }
});
function nextPlayer() {
    activePlayer === 0 ? activePlayer = 1 : activePlayer = 0; //ternary operator
    roundScore = 0;
    document.getElementById('current-0').textContent = '0';
    document.getElementById('current-1').textContent = '0';
    document.querySelector('.player-0-panel').classList.toggle('active');
    document.querySelector('.player-1-panel').classList.toggle('active');
    document.querySelector('.dice').style.display = 'none';
}
document.querySelector('.btn-new').addEventListener('click', init);
function init() {
    scores = [0, 0];
    activePlayer = 0;
    roundScore = 0;
    gamePlaying = true;
    document.querySelector('.dice').style.display = 'none';
    document.getElementById('score-0').textContent = '0';
    document.getElementById('score-1').textContent = '0';
    document.getElementById('current-0').textContent = '0';
    document.getElementById('current-1').textContent = '0';
    document.getElementById('name-0').textContent = 'Player 1';
    document.getElementById('name-1').textContent = 'Player 2';
    document.querySelector('.player-0-panel').classList.remove('winner');
    document.querySelector('.player-1-panel').classList.remove('winner');
    document.querySelector('.player-0-panel').classList.remove('active');
    document.querySelector('.player-1-panel').classList.remove('active');
}