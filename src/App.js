import React from 'react'
import { Provider } from 'react-redux'
import { PersistGate } from 'redux-persist/integration/react'
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link,
  useRouteMatch,
  useParams
} from 'react-router-dom'

import { store, persistor } from './reducers'
import logo from './logo.svg'
import './App.css'

import {
  Header,
  IconApp,
  Menu
} from './components'

import {
  Wrapper
} from './containers'

function App () {
  return (
    <Provider store={store}>
      <PersistGate loading={null} persistor={persistor}>
        { /* <IconApp logo={logo} />
        <Header />
        <Menu /> */}
        <Wrapper />
      </PersistGate>
    </Provider>
  )
}

export default App
