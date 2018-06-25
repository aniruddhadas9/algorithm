# React render callbacks

 In this render callbacks pattern, a component receives a function as its child.
 Take notice of what’s inside the opening and closing <Twitter> tags above.
 Instead of another component as you’ve probably seen before, the Twitter component’s child is a function.
 What this means is that in the implementation of the Twitter component, we’ll need to treat props.children as a function.

if you will look into the below component, the child need to be executed when they promise is resolved.

```html
<Twitter username='tylermcginnis33'>
  {(user) => user === null
    ? <Loading />
    : <Badge info={user} />}
</Twitter>
```

Or you can also use like this where you need to show profile to logged in users

```html
<Twitter username='tylermcginnis33'>
  {(user) => user === null
    ? <Loading />
    : <Profile info={user} />}
</Twitter>
```

to implement this we need to make a component like this.

```javascript

import React, { Component, PropTypes } from 'react'
import fetchUser from 'twitter'

class Twitter extends Component {
  state = {
    user: null,
  }
  static propTypes = {
    username: PropTypes.string.isRequired,
  }
  componentDidMount () {
    fetchUser(this.props.username)
      .then((user) => this.setState({user}))
  }
  render () {
    return this.props.children(this.state.user)
  }
}


```