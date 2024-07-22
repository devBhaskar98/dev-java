package concepts.lombokproject;

import lombok.Builder;

@Builder
public class Consumer {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello I am consumer of lombok project");
		
		Producer producer = new Producer().builder().id(1).name("bhaskar").build();
		
//		
		System.out.println("using lombok to get name without specfying getter/setter " + producer.getName());
		System.out.println("using lombok to get id without specfying getter/setter " + producer.getId());
		
//		// Create a Producer instance using the builder pattern
//		Producer producer2 = producer.builder().id(1).name("bhaskar").build();
//		
//		System.out.println("Producer 2"+ producer2.getId());
	}
	

}
