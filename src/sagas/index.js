import { all, call, delay, put, takeEvery } from 'redux-saga/effects'

export function* getUniversities () {
  console.log('here we will obtain the universities info')
}

export default function* rootSaga () {
  yield all([
    call(getUniversities)
  ])
}
