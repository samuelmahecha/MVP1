package CVDS.Dina.proyecto;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;




/*
 * DISCLAIMER
 * 
 *      ESTA CLASE PRESENTA UN EJEMPLO DE COMO HACER LAS RESPECTIVAS PRUEBAS AL SERVICIO.
 * 
 */





//import co.edu.escuelaing.cvds.lab7.model.Employee;
//import co.edu.escuelaing.cvds.lab7.repository.EmployeeRepository;


@ExtendWith(MockitoExtension.class)
    class EmployeeServiceTest {
    
    //@Mock
    //private EmployeeRepository mockedEmployeeRepository;

    //@InjectMocks
    //private EmployeeService employeeService;

    //private Employee employee;

    @BeforeEach
    public void setup(){
        //employeeRepository = Mockito.mock(EmployeeRepository.class);
        //employeeService = new EmployeeServiceImpl(employeeRepository);
        /**employee = Employee.builder()
                .employeeid("1")
                .first_name("Ramesh")
                .last_name("Fadatare")
                .role("ramesh@gmail.com")
                .build();
                **/
    }
    /**
     * Dado que tengo 1 empleado registrado
     * Cuando lo consulto a nivel de servicio
     * Entonces la consulta será exitosa validando el campo id.
     */
    @Test
    void testName() {
        /** 
        Employee mockedEmployee = new Employee("Santiago", "Parra");
        mockedEmployee.setEmployeeid(Integer.toString(1));
        List<Employee> mockedEmployees = new ArrayList<>();
        mockedEmployees.add(0, mockedEmployee);
        // given - precondition or setup
        given(mockedEmployeeRepository.findAll())
                .willReturn(mockedEmployees);
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println(employees);
        assertThat(employees.get(0).getEmployeeid()).isEqualTo("1");
            **/
    }
    
    /**
     * Dado que no hay ningún empleado registrado
     * Cuándo lo consulto a nivel de servicio
     * Entonces la consulta no retornará ningún resultado.
     */
    @Test
    void testNone() {
        // given - precondition or setup
        /** 
        Employee mockedEmployee = new Employee("Santiago", "Parra");
        mockedEmployee.setEmployeeid(Integer.toString(1));
        List<Employee> mockedEmployees = new ArrayList<>();
        mockedEmployees.add(0, mockedEmployee);

        //when
        given(mockedEmployeeRepository.findByEmployeeid("3")).willReturn(Collections.emptyList());
        //then
        Employee employees = employeeService.getEmployee("3");
        System.out.println(employees);
        assertThat(employees).isEqualTo(null);
        **/
    }

    /**
     *Dado que no hay ningún empleado registrado
     *Cuándo lo creo a nivel de servicio
     *Entonces la creación será exitosa.
     */
    @Test
    void testNew() {
         /**
          
    Employee mockedEmployee = new Employee("Santiago", "Parra");
        mockedEmployee.setEmployeeid(Integer.toString(1));
        List<Employee> mockedEmployees = new ArrayList<>();
        mockedEmployees.add(0, mockedEmployee);
        // given - precondition or setup
        given(mockedEmployeeRepository.findAll())
                .willReturn(mockedEmployees);
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println(employees);
        assertThat(employees.get(0).getEmployeeid()).isEqualTo("1");
        */
    }


    /**
     *Dado que tengo 1 empleado registrado
     *Cuándo lo elimino a nivel de servicio
     *Entonces la eliminación será exitosa.
     */
    @Test
    void testElminiation() {
        /** 
        String employeeId = "1L";
        // given - precondition or setup
        willDoNothing().given(mockedEmployeeRepository).deleteById(employeeId);
        employeeService.deleteEmployee(employeeId);
        verify(mockedEmployeeRepository, times(1)).deleteById(employeeId);
    */
    }
    /**
     *Dado que no hay ningún empleado registrado
     *Cuándo lo creo a nivel de servicio
     *Entonces la creación será exitosa.
     */
    @Test
    void testCrearYEliminiation() {
        /** 
        Employee mockedEmployee = new Employee("Santiago", "Parra");
        mockedEmployee.setEmployeeid(Integer.toString(1));
        List<Employee> mockedEmployees = new ArrayList<>();
        mockedEmployees.add(0, mockedEmployee);
        String employeeId = "1L";
        // given - precondition or setup
        willDoNothing().given(mockedEmployeeRepository).deleteById(employeeId);
        employeeService.deleteEmployee(employeeId);
        verify(mockedEmployeeRepository, times(1)).deleteById(employeeId);
        */
    }

}
