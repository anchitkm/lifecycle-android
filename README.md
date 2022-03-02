# lifecycle-android

This is an example to understand the lifecycle mechanism of Activity and Fragment.

# Case 1: 
**Launching Activity B  from Activity A**
  1. Launch Activity A => OnCreate(**A**) -> OnStart(**A**) -> OnResume(**A**)
  2. Launch Activity B from A => onPause(**A**) -> OnCreate(**B**) -> OnStart(**B**) -> OnResume(**B**) -> OnStop(**A**)
  3. Back press from Activity B - Back to A ==> onPause(**B**) -> OnReStart(**A***) -> OnStart(**A**) -> OnResume(**A**) -> OnStop(**B**) -> OnDestroy(**B**)

# Case 2: 
**Launching Transparent Activity C from Activity A**
  1. Launch Activity B => OnCreate(**A**) -> OnStart(**A**) -> OnResume(**A**)
  2. Launch Activity C from B => onPause(**B**) -> OnCreate(**C**) -> OnStart(**C**) -> OnResume(**C**) XX **( OnStop(**B**) )** This won't be called
  3. Back press from Activity C - Back to B ==> onPause(**C**) -> OnResume(**B**) -> OnStop(**C**) -> OnDestroy(**C**)
