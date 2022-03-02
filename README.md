# lifecycle-android

This is an example to understand the lifecycle mechanism of Activity and Fragment.

# Case 1: 
**Launching one Activity from another**
  1. Launch Activity A => OnCreate(**A**) -> OnStart(**A**) -> OnResume(**A**)
  2. Launch Activity B from A => onPause(**A**) -> OnCreate(**B**) -> OnStart(**B**) -> OnResume(**B**) -> OnStop(**A**)
  3. Back press from Activity B - Back to A ==> onPause(**B**) -> OnReStart(**A***) -> OnStart(**A**) -> OnResume(**A**) -> OnStop(**B**) -> OnDestroy(**B**)
