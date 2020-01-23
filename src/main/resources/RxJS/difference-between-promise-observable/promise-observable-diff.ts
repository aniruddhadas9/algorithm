import * as rxjs from 'rxjs';

export class PromiseObservableDiff {
    private promise: Promise<any> = this.randomFromPromise();
    private observable: rxjs.Observable<any> = this.randomFromObservable();

    constructor() {
        this.promise.then((res)=>{
            console.log(`From promise @1: ${res}`);
        })
        this.observable.subscribe((res)=>{
            console.log(`From promise @1: ${res}`);
        })
    }


    private randomFromPromise() {
        return new Promise((resolve, reject) => {
            resolve(Math.random());
        })
    }

    private randomFromObservable() {
        return new rxjs.Observable((observer) => {
            observer.next(Math.random());
        })
    }
}
