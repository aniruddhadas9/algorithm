# React states

When you want to change anything in side component, you need to use state and changing anything in the state will reflect the view sate as well. 
Although props holds the values taken from the parent components, you cannot cange the value of props, to change, the states need to declared and used.

##### what does setState() do?

 > It merge the object passed in the `setState()` to state object.
 
This will kick off a process called reconciliation and reconciliation updates the UI based on new state.
 
To do this, React will construct a new tree of React elements (which you can think of as an object representation of your UI).
Once it has this tree, in order to figure out how the UI should change in response to the new state, React will diff this new tree against the previous element tree.
By doing this, React will then know the exact changes which occurred, and by knowing exactly what changes occurred, will able to minimize its footprint on the UI by only making updates where absolutely necessary.

##### second argument passed to setState()?

A callback function which will be invoked when setState has finished and the component is re-rendered.

Something that’s not spoken of a lot is that `setState is asynchronous`, which is why it takes in a second callback function. 
Typically it’s best to use another lifecycle method rather than relying on this callback function, but it’s good to know it exists.

this.setState(
  { username: 'tylermcginnis33' },
  () => console.log('setState has finished and the component has re-rendered.')
)



##### What is wrong with this code?

```javascript
this.setState((prevState, props) => {
  return {
    streak: prevState.streak + props.count
  }
})
```

Nothing is wrong with it 🙂. 
It’s rarely used and not well known, but you can also pass a function to setState that receives the previous state and props and returns a new state.
And not only is nothing wrong with it, but it’s also actively recommended if you’re setting state based on previous state.