### Photo of models and relations
![alt text](C:\Users\Sviatoslav\IdeaProjects\jv-taxi-service\taxi_models_diagram.jpeg)

### Photo of db schema
![diagram](C:\Users\Sviatoslav\IdeaProjects\jv-taxi-service\join-db-diagram.png)

### Functional requirements

- 3-tier architecture (controller, service, dao)
- AuthenticationFilter to check if user was logged to website
- JSP for showing html pages 
- JSTL for plugging java code into jsp pages

### Core services and their methods
#### CarService methods
```
    - Car create(Car car);
    - Car get(Long id);
    - List<Car> getAll();
    - Car update(Car car);
    - boolean delete(Long id);
    - void addDriverToCar(Driver driver, Car car);
    - void removeDriverFromCar(Driver driver, Car car);
    - List<Car> getAllByDriver(Long driverId);
```
#### DriverService methods
```
    - Driver create(Driver driver);
    - Driver get(Long id);
    - List<Driver> getAll();
    - Driver update(Driver driver);
    - boolean delete(Long id);
```
#### ManufacturerService methods
```
    - Manufacturer create(Manufacturer manufacturer);
    - Manufacturer get(Long id);
    - List<Manufacturer> getAll();
    - Manufacturer update(Manufacturer manufacturer);
    - boolean delete(Long id);
```

