// REDUX FLOW:

possibleObject = {type: RATE_COURSE, rating: 5}
// Action  ==>   Store ===> <== Reducers
                // ==> React

// = Action describes a user's intent, a plain function
// = Requires a type property
// Should not try to pass in things that can't be serialized like functions & promises
rateCourse(rating) {
    return {type: RATE_COURSE, rating: rating} //<--- the action itself
}

// Actions created by CONVENIENCE FUNCTIONS CALLED action creators ^(above)
// Not required, but follow this convention as they are not required. 


// Function that returns a new state based on the action
//= Reducers
function appReducer(state = defaultState, action) {
    sweitch(action.type){
        case(RATE_COURSE);
        //  == Return Some data
 }
}


// When using redux, should try to avoid methods that directly mutate the arrays;

// AVOID
Array.push()
Array.pop();
Array.reverse()

// Prefer to Use
Array.map()
Array.filter()
Array.reduce();
Array.concat();
Array.spread();

// Reducers
function myReducer(state, action) {
    // Return new state based on action passed
}

// Reducers must be pure functions
// Never mutate arguments
// Never perform Side effects
// Never call non-pure functions(Such as Math.Random() & Date.now())
// Reducers should return an UPDATED COPY of state. Redux will then use that copy to update the store.
// One store. Multiple Reducers

// In initial state, redux calls on the reducers to set the initial state.
// All reducers are called when the action is dispatched.
// Switch statement determines if it has anything to do. That's why DEFAULT should alweays return original state.
// Allows for changes of the stores in slices & isolation

// Reducer COMPOSITION
// Each action can be handled by multiple reducers. Each reducer can handle multiple actions.

function myReducer(state, action) {
    switch(action.type) {
        case "INCREMENT_COUNTER":
            return {...state, counter: state.counter + 1};
        default: 
            return state;    
    }
}

 


// Two Component Types: Container & Presentational (Smart & Dumb)

/* Container Components focus how things work while Presentational Components focus on how things look 
   Container Components are aware of Redux and subscribe to Redux State while Presentational Components only read data & invoke callbacks
   Container components dispatch redux actions

*/

// React Redux = Provider (Attaches app to store) & Connect (Creates container components)
<Provider store={this.props.store}>
    <App />
</Provider>

// Wraps our component so it's connected to the Redux Store.
function mapStateToProps(state, ownProps) {
    return { authors: state.authors };
}
//                  What state do you want to pass to your component, What actions do you want to pass to your component
export default connect(mapStateToProps, mapDispatchToProps)(AuthorPage);
// Both parameters are optional.First function returns an object
// mapDispatchToProps = what actions to pass in
function mapDispatchToProps(dispatch) {
    return {
        action: bindActionCreators(actions, dispatch)
    }
}
//  Memoization = caching for function calls. Increases performance (Reselect Library)
// 4 ways to handle mapDispatchToProps
// 1. Ignore

this.props.dispatch(loadCourses())
// downsides: boilerplate
// Redux concerns in child components

// 2. Wrap Manually
// Wrap every indv action via an anonymous function that calls the dispatch
// Very verbose, good in small but bad in large
function mapDispatchToProps(dispatch) {
    return {
        loadCourses: () => {

        },
        createCourse: () => {

        }
    }
}
this.props.loadCourses();
// 3. bindActionCreators
function mapDispatchToProps(dispatch) {
    return {
        actions: bindActionCreators(actions, dispatch)
    }
}
// bindActionCreators wraps dispatch calls for you
this.props.actions.loadCourses();
// 4. Return Object
const mapDispatchToProps = {
    loadCourses
}
// returns an object 
this.props.loadCourses()

