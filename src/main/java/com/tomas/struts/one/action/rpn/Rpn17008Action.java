package com.tomas.struts.one.action.rpn;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Generacion de Extracto y Mostrar datos tablas Ccv sobre su covertura
 * <p>
 * Datos a mostrar
 * 1: Mes o Trimestre
 * 2: Tradicional
 * 3: Seguimiento de segundo año
 * 4: Seguimiento de tercer año
 * 5: Descuento nominal
 * 6: Numero de polizas
 *
 * @author Tomas Yussef
 */
public class Rpn17008Action extends Action
{

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
    {

        Rpn17008Form formRpn17008 = (Rpn17008Form) form;
        formRpn17008.setMessageTest("Action xD");
        if (formRpn17008.getProceso().equals("consulta"))
            formRpn17008.setExtractoProceso(false);
        else
            formRpn17008.setExtractoProceso(true);

        ArrayList<Rpn17008Form> listaAction = formRpn17008.getList();
        request.setAttribute("listaAction", listaAction);
        return mapping.findForward("ok");

    }
}