//http://aimforsimplicity.com/post/13-things-you-need-to-know-about-react/ 

//Things you should know about React

/* 1) React is just a library */
    //Different from Angular (a framework)

    //You would use react because it is easy to mix with other libraries and has a rich library for almost anything

/* 2) JSX
    "Syntactic sugar for the react.createElement(components, props, ...children) function"
    "Used because rendering logic should be inherently coupled with UI logic" e.g. = how events are handled, etc. 

    *JS* */
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

/* 3) React is Declarative */
        //use declarative style to write the components. 
        //Declarative means that the code expresses the logic of computation without needing control flow. 
        //React elements are immutable. Once you create it, you can't change its children or attributes.
        
        function tick() {
            const elements = (
                <div>
                    <h1>Hello, world!</h1>
                    <h2> It is {new Date().toLocaleTimeString()}.</h2>
                </div>
            );
            ReactDOM.render(element, document.getElementById('root'));
        }
        setInterval(tick, 1000);

/* 4) Components and Props */
        function Welcome(props) {
            return <h1> Hello, {props.name} </h1>
        } //valid React component as it accepts a single "props", object argument with data and returns a React element. 
        //these are "function components" as they are literally JS functions.

        //with ES6 Class:
        class Welcome extends React.Component {
            render() {
                return <h1>Hello, {this.props.name}</h1>
            }
        }

        //Elements can also represent user-defined components:
        const element = <Welcome name="Sara" />;

// We call ReactDOM.render() with the < Welcome name = "Sara" /> element.
// React calls the Welcome component with { name: 'Sara' } as the props.
// Our Welcome component returns a < h1 > Hello, Sara</h1 > element as the result.
// React DOM efficiently updates the DOM to match < h1 > Hello, Sara</h1 >.