import {
  createStore,
  applyMiddleware,
  combineReducers
} from 'redux'
import {
  persistStore,
  persistReducer
} from 'redux-persist'
import storage from 'redux-persist/lib/storage'

import ui from './ui'

const storageReducer = combineReducers({ ui })
const persistConfig = {
  key: 'root',
  storage
}
const persistedReducer = persistReducer(persistConfig, storageReducer)

export const store = createStore(persistedReducer)
export const persistor = persistStore(store)
