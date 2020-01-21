import storage from 'redux-persist/lib/storage'
import logger from 'redux-logger'
import createSagaMiddleware from 'redux-saga'
import {
  createStore,
  applyMiddleware,
  combineReducers
} from 'redux'
import {
  persistStore,
  persistReducer
} from 'redux-persist'

import ui from './ui'
import universities from './universities'
import members from './members'
import galery from './galery'

import sagas from '../sagas'

const sagaMiddleware = createSagaMiddleware()

const storageReducer = combineReducers({
  ui,
  universities,
  members,
  galery
})

const persistConfig = {
  key: 'root',
  storage
}
const persistedReducer = persistReducer(persistConfig, storageReducer)

const store = createStore(persistedReducer, applyMiddleware(sagaMiddleware, logger))

const persistor = persistStore(store)

sagaMiddleware.run(sagas)

export { store, persistor }
