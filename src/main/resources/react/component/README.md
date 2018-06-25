# React


##### Difference between Element and a Component 
React element describes what you want to see on the screen. Not so simply put, a React element is an object representation of some UI.

A React component is a function or a class which optionally accepts input and returns a React element (typically via JSX which gets transpiled to a createElement invocation).


##### Class Component over a Functional Component

If your component has state or a lifecycle method(s), use a Class component. Otherwise, use a Functional component.

##### What are refs in React?

Refs are an escape hatch which allow you to get direct access to a DOM element or an instance of a component.
In order to use them you add a ref attribute to your component whose value is a callback function which will receive the underlying DOM element or the mounted instance of the component as its first argument.


```javascript

class UnControlledForm extends Component {
  handleSubmit = () => {
    console.log("Input Value: ", this.input.value)
  }
  render () {
    return (
      <form onSubmit={this.handleSubmit}>
        <input
          type='text'
          ref={(input) => this.input = input} />
        <button type='submit'>Submit</button>
      </form>
    )
  }
}
```

Refs can also be used in functional components.

##### Keys

Keys are what help React keep track of what items have changed, been added, or been removed from a list.

```javascript
render () {
  return (
    <ul>
      {this.state.todoItems.map(({task, uid}) => {
        return <li key={uid}>{task}</li>
      })}
    </ul>
  )
}
```

It’s important that each key be unique among siblings.
Keys make reconciliation process more efficient when dealing with lists because React can use the key on a child element to quickly know if an element is new
or if it was just moved when comparing trees. And not only do keys make this process more efficient, but without keys, React can’t know which local state corresponds to which item on move. So never neglect keys when mapping.


