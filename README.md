# Hello-World-By-Agera

Hello World Example using Agera

# Observable, Updatable, Supplier, Receiver

The foundation of Agera is a set of very simple interfaces including: `Observable`, `Updatable`, `Supplier` and `Receiver`:

* `Observable` => Something that can be observed for changes and stores a list of updatable objects. When a change occurs, the updatables are poked
* `Updatable` => Called when an event has occurred. Its `update()` method will be called when the class it observes changes, but can also be called manually to force an update.
* `Supplier` => Something that supplies data when the `get()` method is called. In this case, "Data" can be anything.
* `Receiver` => Something that can receive (and normally store) a value send to it via `accept()`.



[More sample are Here](https://github.com/AnkitDroidGit/Agera-Android-Sample/).

[This Link](https://github.com/AnkitDroidGit/Agera-Android-Sample/blob/master/README.md) can be seen for more documents/tutorials.

## let's connect to learn together
- [Twitter](https://twitter.com/KumarAnkitRKE)
- [Github](https://github.com/AnkitDroidGit)
- [LinkedIn](https://www.linkedin.com/in/kumarankitkumar/)
- [Facebook](https://www.facebook.com/freeankit)
- [Slack](https://ankitdroid.slack.com)


### License

    Copyright 2017 Ankit Kumar
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

