//http://aimforsimplicity.com/post/13-things-you-need-to-know-about-react/ 

Things you should know about React //Simple!

1) React is just a library
    //Different from Angular (a framework)

    //You would use react because it is easy to mix with other libraries and has a rich library for almost anything

2) JSX
    "Syntactic sugar for the react.createElement(components, props, ...children) function"
    "Used because rendering logic should be inherently coupled with UI logic" e.g. = how events are handled, etc. 

    *JS*
        const rootElement =
        React.createElement('div', {},
            React.createElement('h1', {style: {color: 'red'}}, 'The world is yours'),
            React.createElement('p', {}, 'Say hello to my little friend')
        )

        ReactDOM.render(rootElement, document.getElementById('app'))

    *JSX*
        const RootElement = (
            <div>
            <h1 style=>The world is yours</h1>
            <p>Say hello to my little friend</p>
            </div>
        ) 
      
        ReactDOM.render(RootElement, document.getElementById('app'))
        //converted with Babel. 

3) React is Declarative
        //use declarative style to write the components. 
        //Declarative means that the code expresses the logic of computation without needing control flow. 
        
