This project showcases the usage of mapstruct to perform partial updates on db entities via the NullValuePropertyMappingStrategy.IGNORE and @MappingTarget annotation
It also uses component model Spring so that mapper instances can be easily autowired.
Also java code is directly used with the @Mapping annotation in order to set a target field like here: @Mapping(target = "identifier", expression = "java(java.util.UUID.randomUUID().toString())")

