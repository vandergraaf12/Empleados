package himt.empleados.servicio;

import himt.empleados.modelo.Empleado;

import java.util.List;

public interface IEmpleadoService {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public void guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
