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

const storageReducer = combineReducers({ ui })
const persistConfig = {
  key: 'root',
  storage
}
const persistedReducer = persistReducer(persistConfig, storageReducer)

export const store = createStore(persistedReducer, applyMiddleware(logger))
export const persistor = persistStore(store)
