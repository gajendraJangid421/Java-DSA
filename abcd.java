@GetMapping(path = "/users/{id}")
    public Users retrieveUser(@PathVariable int id){

        for(int i=0;i<services.findAll().size();i++){
            int index = services.findAll().get(i).getId();

            if(index==id){
                return services.findUser(i);
            }
        }

        return services.findUser(-1);
    }

//convert to lamda
