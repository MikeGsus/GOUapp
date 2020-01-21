import storage from 'redux-persist/lib/storage'
import logger from 'redux-logger'
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

export const store = createStore(persistedReducer, applyMiddleware(logger))
export const persistor = persistStore(store)
