Marta Scheduler

06/28/17
Want to create an app that will combine the functionality of a scheduler, like an alarm clock, with realtime Marta train data and user inputed walk travel estimates
to have an app that will alert the user when they should leave to go and get on the train, so that on average they aren't wasting time sitting at the station.

First, need to get real time train data from Marta in a format that can be accessed at any time and parsed by the app. Have tried this before, and I believe that the
source I found last time was a link on a similar project's github; Marta's api didn't work last I tried.

Found it! Google led me to this:
http://developer.itsmarta.com/RealtimeTrain/RestServiceNextTrain/GetRealtimeArrivals?apiKey=
where apiKey is one provided to you after request, I have one in email but probably wont put it up here in case that isn't cool.

Now, need to be able to parse this data into something legible. Think it is in JSON format, so if so need a JSON parser.
So, for stages of execution, user needs to be able to enter the station they will be goin to, and the app will need to parse the JSON
arrivals to find all trains that will be arriving at that station

Wrinkle, The arrivals output only shows the final destination of the train and the current location of the train, so it gets more difficult to predict
train arrivals at a station that is furthur out timewise.

Also need to decide what the app will be, native Android or a web app. Think I will lean towards web app now since I have less experience there.
So, for a web app, I need a website, so first I will see if I can create and host a basic HTML website.

Created basic html website, but if I want to make this app, I must first learn how to make webapps. Started freecodecamp webdev class, will see
if I want to continue with this after I finish that or not.
