# EVENT

Event handling is the most important feature in one javascript library as it saves you at the time of need

#### react event handling

In order to solve cross browser compatibility issues, your event handlers in React will be passed instances of SyntheticEvent, which is React’s cross-browser wrapper around the browser’s native event. 
These synthetic events have the same interface as native events you’re used to, except they work identically across all browsers.

What’s mildly interesting is that React doesn’t actually attach events to the child nodes themselves. 
React will listen to all events at the top level using a single event listener. 
This is good for performance and it also means that React doesn’t need to worry about keeping track of event listeners when updating the DOM.

##### difference between createElement and cloneElement?
