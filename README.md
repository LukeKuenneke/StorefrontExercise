# Storefront Exercise

### Please Note 

Interview anxiety is a common experience, so please notify any team member if you or someone else needs a break or wishes to end the exercise. \
We aim to create a supportive and energizing environment where everyone can work comfortably.

### Exercise Guidelines and Rules

#### General

- This phase of the interview process can be passed without fully solving the exercise, software is never finished.
- You are being evaluated on:
    - How you approach problem solving
    - How you apply software engineering best practices to ensure quality is baked into your solution \
      Note: Treat this as any professional project, what do you do to make sure the codebase is good?
- Please note and share your ideas as time may limit your ability to implement them into a solution
- All resources you have available to you are at your disposal
- Where you deem appropriate, you can modify the initial source code provided
- We prefer that all participants utilize a language they are unfamiliar with or one they are very comfortable with.
- Please do not hesitate to reach out to your point of contact if you have any questions

#### Take Home

- You are provided as much time as you deem appropriate to develop and submit your solution.


#### Pair Programming
- You are being evaluated on:
    - Collaboration
    - Communication
- This is a paring exercise and all participants shall participate
- This is not an observation session of the interviewee
- A programming language may be selected for you or you may be allowed to utilize any the selected platform offers
- You have a one hour timebox, the timer will begin when participants are ready.
- The timer may be paused during breaks

## Exercise

Welcome to the StoreFront, where we are proud to offer only the finest items in a prime location in a prominent city. Our friendly store manager, Sarah, runs the shop with ease, and our inventory system has been developed by a no-nonsense individual named Larry, who has since moved on to new adventures. To enhance our offering, we have recently signed an alchemist to create unique "Alchemy" items. However, this requires an update to our existing system to ensure accurate tracking of these new items' values.

Our current system updates both the ShelfLife and Worth values for every item at the end of each day. The ShelfLife value indicates how many days we have left to sell an item before it becomes obsolete, while the Worth value represents an item's overall value. Once an item's ShelfLife date has passed, its Worth degrades twice as fast, and the Worth of an item can never exceed 50, with "Cadmium" being a rare exception at 80. Interestingly, "Gold" actually increases in Worth over time, while "Helium" follows a similar trend but at a slower pace.

To accommodate these new "Alchemy" items, we need to make adjustments to the UpdateWorth method and add any necessary new code. However, please be aware that any changes made to the Item class or Items property are outside of our scope, as they belong to another team that does not believe in shared code ownership. We suggest making the UpdateWorth method and Items property static if you wish to include them in your solution.

In summary, our goal is to ensure that all items' values are accurately tracked and maintained in our system. If you encounter any conflicts with the requirements above, please do not hesitate to resolve them

## Languages 
- Java
- Don't see the specific language you are looking for? \
  Please reach out to your point of contact. We can generate and  provide you with the initial source code in your desired language, preferably a language that's not too obscure.

## Feedback

Please share any thoughtful and actionable feedback from the interview with your point of contact. \
We are constantly looking for ways to improve and refine our interview process, so your input is valuable and appreciated.

## Acknowledgements

This exercise was adapted from a popular software engineering problem originally created by [Pomiet](https://www.pomiet.com/).