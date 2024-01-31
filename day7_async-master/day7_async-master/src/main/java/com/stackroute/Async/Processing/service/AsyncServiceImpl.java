package com.stackroute.Async.Processing.service;

import org.springframework.stereotype.Service;

/*
 * This class is implementing the AsyncService interface. This class has to be annotated with
 * @Service annotation.
 * @Service indicates annotated class is a service
 * which hold business logic in the Service layer
 *
 * */
@Service
public class AsyncServiceImpl implements AsyncService {
    @Override
    public void performAsyncTask() {
        // Simulate a time-consuming task

        try{
            //delaying
            Thread.sleep(5000);

        }catch (Exception e){
            System.out.println(e);
        }
//       


        //After time-consuming task print Async task completed.
         System.out.println("Async task completed");


    }

}
