import { join } from "path";

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
        // const RootElement = (
        //     <div>
        //     <h1 style=>The world is yours</h1>
        //     <p>Say hello to my little friend</p>
        //     </div>
        // ) 
      
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

        //We call ReactDOM.render() with the <Welcome name="Sara" /> element.
        //React calls the Welcome component with {name: 'Sara'} as the props.
        //Our Welcome component returns a <h1>Hello, Sara</h1> element as the result.
        //React DOM efficiently updates the DOM to match <h1>Hello, Sara</h1>.
        //React treats components starting with lowercase letters as DOM tags. 
        //For example, <div /> represents an HTML div tag, but <Welcome /> represents a component and requires Welcome to be in scope.

        function Welcome(props) {
            return <h1>Hello, {props.name}</h1>;
          }
          
          function App() {
            return (
              <div>
                <Welcome name="Sara" />
                <Welcome name="Cahal" />
                <Welcome name="Edite" />
              </div>
            );
          }
          
          ReactDOM.render(
            <App />,
            document.getElementById('root')
          );

          //Extracting Components and making them into smaller components:
          //This would be multiple nested functions:
          function Comment(props) {
            return (
              <div className="Comment">
                <div className="UserInfo">
                  <img className="Avatar"
                    src={props.author.avatarUrl}
                    alt={props.author.name}
                  />
                  <div className="UserInfo-name">
                    {props.author.name}
                  </div>
                </div>
                <div className="Comment-text">
                  {props.text}
                </div>
                <div className="Comment-date">
                  {formatDate(props.date)}
                </div>
              </div>
            );
          }
//===============================================================
        //Separating them into smaller components: 
        function Avatar(props) {
            return (
              <img className="Avatar"
                src={props.user.avatarUrl} //user rather than avatar. 
                alt={props.user.name}
              />
          
            );
          }

          function UserInfo(props) {
            return (
              <div className="UserInfo">
                <Avatar user={props.user} />
                <div className="UserInfo-name">
                  {props.user.name}
                </div>
              </div>
            );
          }
          //We recommend naming props from the component’s own point of view rather than the context in which it is being used.
          //Simplified: 
          function Comment(props) {
            return (
              <div className="Comment">
                <UserInfo user={props.author} />
                <div className="Comment-text">
                  {props.text}
                </div>
                <div className="Comment-date">
                  {formatDate(props.date)}
                </div>
              </div>
            );
          }

//===============================================================
//Props are Read-Only
  //Cannot modify on own props. 
  //All React components must act like pure functions with respect to their props.




//===============================================================
  //States and LifeCycles
  //State is similar to props, but it is private and fully controlled by the component.
  //Local state is a feature available only to the classes.
  
  //State is often called local/encapsulated, it is not accessible to any component other than the one that owns and sets it. 

  //this is without extending the original react component class. 
  //only a function.
  function Clock(props) {
    return (
      <div>
        <h1>Hello, world!</h1>
        <h2>It is {props.date.toLocaleTimeString()}.</h2>
      </div>
    );
  }
  
  function tick() {
    ReactDOM.render(
      <Clock date={new Date()} />,
      document.getElementById('root')
    );
  }
  
  setInterval(tick, 1000);
  
  //Converting a function into a class. 
// 1)  Create an ES6 class, with the same name, that extends React.Component.

// 2) Add a single empty method to it called render().

// 3) Move the body of the function into the render() method.

// 4) Replace props with this.props in the render() body.

// 5) Delete the remaining empty function declaration.

class Clock extends React.Component {
  //Adding a class constructor that assigns initial this.state
  constructor(props) { //still passing props to the base constructor. 
    super(props); //Class components should always call the base constructor with props. 
    this.state = {date: new Date()};
  }
  render() { //will be called each time an update happens, but as long as 
    //<Clock /> is rendered into the same DOM node, only a single instance of Clock class will be used. 
    return (
      <div>
        <h1>Hello, world!</h1>
        <h2>It is {this.state.date.toLocaleTimeString()}.</h2>
      </div>
    );
  }
}

function tick() {
  ReactDOM.render(
    <Clock />, //removed date prop from the element. 
    document.getElementById('root')
  );
}
//What will return here is the current time, but it will not update every second. It will only return the full. 

  //Adding Lifecycle Methods to class:
    //"Mounting" in React. 
    //Whenever the Clock is rendered 
    //"Unmounting" in React. 
    //Clear that timer when the DOM produced by the clock is removed.
    //Special methods on component class to run code when a component mounts and unmounts:
    class Clock extends React.Component {
      constructor(props) {
        super(props);
        this.state = {date: new Date()};
      }
    
      componentDidMount() {
          //runs after the component output has been rendered to the DOM. 
          this.timerID = setInterval( //saving the timer ID on this. 
            //you are free to add additional fields to the class manually if you need to store something that doesn't participate in the data flow. 
            () => this.tick(), 
            1000
          );
      };
    
      componentWillUnmount() {
          //tearing down the timer. 
          clearInterval(this.timerID);
      }

      tick() { //component will run every second.
        this.setState({ //to schedule updates to the component local state. 
          date: new Date()
        });
      }
    
      render() {
        return (
          <div>
            <h1>Hello, world!</h1>
            <h2>It is {this.state.date.toLocaleTimeString()}.</h2>
          </div>
        );
      }
    }

    ReactDOM.render(
      <Clock />,
      document.getElementById('root')
    );

//===============================================================
       //things to know about setState()
            //Do not modify state directly
            //this.setState({comment: 'Hello'});
          //State Updates May be Asynchronous
            //can batch multiple setState() calls into a single update for performance. 
            this.setState((state, props) => ({
              counter: state.counter + props.increment }));
          //State Updates are Merged.
            //when calling setState(), react merges the object you provide into the current state. 
              constructor(props) {
                super(props);
                this.state = {
                  posts: [],
                  comments: []
                };
              }
              //then you call these independent variables separately
              componentDidMount() {
                fetchPosts().then(response =>  {
                  this.setState({
                    posts: response.posts
                  });
                });

                fetchComments().then(response => {
                  this.setState({
                    comments: response.comments
                  });
                });
              }

//===============================================================
              function FormattedDate(props) {
                return <h2>It is {props.date.toLocaleTimeString()}.</h2>;
              }
              
              class Clock extends React.Component {
                constructor(props) {
                  super(props);
                  this.state = {date: new Date()};
                }
              
                componentDidMount() {
                  this.timerID = setInterval(
                    () => this.tick(),
                    1000
                  );
                }
              
                componentWillUnmount() {
                  clearInterval(this.timerID);
                }
              
                tick() {
                  this.setState({
                    date: new Date()
                  });
                }
              
                render() {
                  return (
                    <div>
                      <h1>Hello, world!</h1>
                      <FormattedDate date={this.state.date} />
                    </div>
                  );
                }
              }
              
              function App() {
                return (
                  <div>
                    <Clock />
                    <Clock />
                    <Clock />
                  </div>
                );
              }
              ReactDOM.render(<App />, document.getElementById('root'));

//===============================================================
//Handling Events: 
  //Pass a function as the event handler rather than a string in JSX. 
  <button onClick = {activateLasers}>
    Activate Lasers
  </button>  
  //cannot return false to prevent default behavior in React. 
  //Must call preventDefault explicitly. 
  function ActionLink() {
    function handleClick(e) {
      e.preventDefault(); //e = synthetic event. 
      console.log('The link was clicked.');
    }

    return (
      <a href="#" onClick={handleClick}>
        Click Me
      </a>
    );
  }

  //Common pattern is for an event handler to be a method on the class. 
  class Toggle extends React.Component {
    constructor(props) {
      super(props);
      this.state = {isToggleOn: true};
  
      // This binding is necessary to make `this` work in the callback
      this.handleClick = this.handleClick.bind(this);
    }
  
    handleClick() {
      this.setState(state => ({
        isToggleOn: !state.isToggleOn
      }));
    }
  
    render() {
      return (
        <button onClick={this.handleClick}>
          {this.state.isToggleOn ? 'ON' : 'OFF'}
        </button>
      );
    }
  }
  
  ReactDOM.render(
    <Toggle />,
    document.getElementById('root')
  );