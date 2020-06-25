package chotu;

final class Student {
	public Student(Builder builder) {
		this.id=builder.id;
		this.name=builder.name;
		this.address=builder.address;
	}

	// final instance fields 
    private final int id; 
    private final String name; 
    private final String address;
	
    public static class Builder
    {
    	/// instance fields 
        private int id; 
        private String name; 
        private String address;
        
        
        private Builder()
        {
        	
        }
        
        public static Builder newInstance()
        {
        	return new Builder();
        }
        
        public Builder setId(int id)
        {
        	this.id=id;
        	return this;
        }
        
        public Builder setName(String name)
        {
        	this.name=name;
        	return this;
        }
        
        public Builder setAddress(String address)
        {
        	this.address=address;
        	return this;
        }
        
        public Student build() {
        	return new Student(this);
        }
    }
    @Override
    public String toString() 
    { 
        return "id = " + this.id + ", name = " + this.name +  
                               ", address = " + this.address; 
    } 
    
    
    
}
