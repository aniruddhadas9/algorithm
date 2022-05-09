# Elastic Load Balancing(ELB)

Elastic Load Balancer (ELB) is one of the key architecture components for many applications inside the AWS cloud. In addition to auto scaling, it enables and simplifies one of the most important tasks of our application’s architecture: scaling up and down with high availability.

Elastic Load Balancing automatically distributes incoming application traffic across multiple applications, microservices, and containers hosted on Amazon EC2 instances.

One of the many advantages of using ELB is the fact that it is elastic, which means that it will automatically scale to meet your incoming traffic. If you are a system administrator or a DevOps engineer running your load balancer by yourself, then you need to worry about scaling load balancer and enabling high availability. With ELB, you can create your load balancer and enable dynamic scaling with just a few clicks.

Since it was first released in 2009, Elastic Load Balancer has added numerous improvements and features. The Application Load Balancer (ALB) is a logical step forward in developing load balancing possibilities inside the AWS cloud. With this addition, the original load balancer has been renamed Classic Load Balancer, and it’s still available for use inside the AWS cloud. In this post, we’ll check out the features of Application Load Balancer compared to the original, show you how to monitor ALB, and finally, we’ll take a look at pricing.

# Application Load Balancer (ALB) 