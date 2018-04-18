const bands = ['The Plot in You', 'The Devil Wears Prada', 'Pierce the Veil', 'Norma Jean', 'The Bled', 'Say Anything', 'The Midway State', 'We Came as Romans', 'Counterparts', 'Oh, Sleeper', 'A Skylit Drive', 'Anywhere But Here', 'An Old Dog'];
//array.sort method practice organizing without articles.

function stripArticles(bandName) { //regexe to remove articles.
    return bandName.replace(/^(a |the |an )/i, '').trim();
}


//organizes all but takes into account the articles
const sortedBands = bands.sort((a,b) =>  stripArticles(a) > stripArticles(b) ? 1 : -1); //ternary function

document.querySelector("#bands").innerHTML = 
    sortedBands.map(band => `<li>${band}</li>`).join('');
console.log(sortedBands);