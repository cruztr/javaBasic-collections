### should_go_through_an_iterator()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with iterators

2.Why the test failed at first?
* Because of the incomplete implementation for some methods

3. Why you corrected the test that way?
* Because iterators can be used to add objects like a list

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_create_a_sequence_without_putting_all_items_into_memory()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with iterators

2.Why the test failed at first?
* Because of the incomplete implementation for some methods

3. Why you corrected the test that way?
* Because we can use iterators to assign the elements into a list

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_predict_linked_list_operation_result()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with iterators

2.Why the test failed at first?
* Because of the incomplete implementation for some methods

3. Why you corrected the test that way?
* Because when iterator.add() is called, the current iterated object will be the next object and not the newly added 
one. 

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_generate_distinct_sequence_on_the_fly()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with iterators

2.Why the test failed at first?
* Because of the incomplete implementation for some methods

3. Why you corrected the test that way?
* Because when we use the normal implementation, the data is so large that it may have bad runtime. So for the 
solution, since it is a distinct iterator, we first check if the element is already existing in the list. If not, we 
will add the element. 

4. Do you have further questions on this knowledge point?
* No questions so far.



### should_reflects_back_to_original_list_for_sub_range()
1.What is the knowledge point of the test? Where is the official document to the knowledge point?
* The knowledge point of the test is to be familiar with the sublist

2.Why the test failed at first?
* Because of the incomplete implementation for some methods

3. Why you corrected the test that way?
* Because when a subList is created, it references a part of the list where it came from. So modifying the sublist 
will also modify the original list.

4. Do you have further questions on this knowledge point?
* No questions so far.