# Storefront Exercise

### Please Note 

Interview anxiety is a common experience, so please notify any team member if you or someone else needs a break or wishes to end the exercise.

We aim to create a supportive and energizing environment where everyone can work comfortably.

### Exercise Guidelines and Rules

#### General

- This phase of the interview process can be passed without fully solving the exercise, software is never finished
- You are being evaluated on:
    - How you approach problem solving
    - How you apply software engineering best practices to ensure quality is baked into your solution \
      Note: Treat this as any professional project, what do you do to make sure the codebase is good?
- Please note and share your ideas as time may limit your ability to implement them into a solution
- All resources you have available to you are at your disposal
- Where you deem appropriate, you can modify the initial source code provided unless stated otherwise
- We prefer that all participants utilize a language they are unfamiliar with or one they are very comfortable with
- Please do not hesitate to reach out to your point of contact if you have any questions

#### Take Home

- You are provided as much time as you deem appropriate to develop and submit your solution


#### Pair Programming
- You are being evaluated on:
    - Collaboration
    - Communication
- This is a paring exercise and all participants shall participate
- This is not an observation session of the interviewee
- A programming language may be selected for you or you may be allowed to utilize any the selected platform offers
- You have a one hour timebox, the timer will begin when participants are ready
- The timer may be paused during breaks

## Exercise

 Hello and welcome to StoreFront! As you know, we are a small store with a prime location in a prominent city run by a friendly store manager named Sarah. We also buy and sell only the finest elements. Unfortunately, our items are constantly losing shelf value as they approach their sell-by date. We have a system in place that updates our inventory for us. It was developed by a no-nonsense guy named Larry, who has moved on to new adventures. Your task is to add a new feature to our system so that we can begin selling a new category of items.

First, let's introduce you to our system:
* All items have a ShelfLife value, which denotes the number of days we have to sell the item.
* All items have a Worth value, which denotes how valuable the item is.
* At the end of each day, our system lowers both values for every item.

Interesting? Well, this is where it gets exciting:
* Once the shelf life date has passed, worth degrades twice as fast.
* The Worth of an item is never negative.
* "Gold" actually increases in Worth the older it gets.
* The Worth of an item is never more than 50.
* "Cadmium" is rare, has a worth of 80, and will never decrease in Worth.
* "Helium," like gold, increases in Worth as its ShelfLife value changes; Worth increases by 2 when there are 10 days or less and by 3 when there are 5 days or less, but Worth drops to 0 once the ShelfLife is passed.

We have recently signed an alchemist to create "Alchemy" items. This requires an update to our system:
* "Alchemy" items degrade in Worth twice as fast as normal items.
* "Alchemy" items have a maximum worth of 100.

Feel free to make any changes to the UpdateWorth method and add any new code as long as everything still works correctly. However, do not alter the Item class or Items property as those belong to another team that doesn't believe in shared code ownership. If you happen to find any conflicts with the above requirements, please fix them.

Just for clarification, an item can never have its Worth increase above 50, but "Cadmium" is a rare item and as such, its Worth is 80, and it never alters.

Spend as much time as you feel comfortable spending. Typically, you can expect to commit about 1 hour towards your solution. We look forward to seeing the completed project. Please return all of the files that you create when submitting your solution.

## Languages 
- Java
- Don't see the specific language you are looking for? \
  Feel free to do the reimplementation or we can generate and provide you with the initial source code in your desired language. \
  Just be sure to reach out to your point of contact if you would like it provided instead.

## Feedback

Please share any thoughtful and actionable feedback from the interview with your point of contact. 

We are constantly looking for ways to improve and refine our interview process, so your input is valuable and appreciated.

## Acknowledgements

This exercise was adapted from a popular software engineering problem originally created by [Pomiet](https://www.pomiet.com/).
