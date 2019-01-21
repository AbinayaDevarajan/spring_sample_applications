# spring_sample_applications

To manipulate the properties of the spring properties by changing the setters


  <bean id="entityLogFilter1" class="com.springexample.LogFilter">
	
		<property name="filterProperty" value ="${filterWithTrailingSpace} "/>

	</bean>




	<bean id="entityLogFilterExample" class="com.springexample.LogFilter">
		<property name="logFilter" value="#{entity1.logContent matches entityLogFilter1.filterProperty }" />
	</bean
  
  
