package com.tomas.struts.one.action.rpn;

import org.apache.struts.action.ActionForm;

import java.util.ArrayList;

/**
 * @author Tomas Yussef
 */
public class Rpn17008Form extends ActionForm
{
    private boolean extractoProceso;
    private String proceso;
    private String codigoAsesor;
    private String temporada;
    private String mensual;
    private String puesto;
    private String messageTest;
    private ArrayList<Rpn17008Form> list;

    public Rpn17008Form()
    {
        this.proceso = "consulta";
        this.extractoProceso = true;
    }

    public boolean isExtractoProceso()
    {
        return extractoProceso;
    }

    public void setExtractoProceso(boolean extractoProceso)
    {
        this.extractoProceso = extractoProceso;
    }

    public String getProceso()
    {
        return proceso;
    }

    public void setProceso(String proceso)
    {
        this.proceso = proceso;
    }

    public String getCodigoAsesor()
    {
        return codigoAsesor;
    }

    public void setCodigoAsesor(String codigoAsesor)
    {
        this.codigoAsesor = codigoAsesor;
    }

    public String getTemporada()
    {
        return temporada;
    }

    public void setTemporada(String temporada)
    {
        this.temporada = temporada;
    }

    public String getMensual()
    {
        return mensual;
    }

    public void setMensual(String mensual)
    {
        this.mensual = mensual;
    }

    public String getPuesto()
    {
        return puesto;
    }

    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }

    public String getMessageTest()
    {
        return messageTest;
    }

    public void setMessageTest(String messageTest)
    {
        this.messageTest = messageTest;
    }

    public ArrayList<Rpn17008Form> getList()
    {
        this.list = new ArrayList<>();
        Rpn17008Form form1 = new Rpn17008Form();
        form1.setMessageTest("Message 1");
        this.list.add(form1);
        Rpn17008Form form2 = new Rpn17008Form();
        form2.setMessageTest("Message 2");
        this.list.add(form2);
        Rpn17008Form form3 = new Rpn17008Form();
        form3.setMessageTest("Message 3");
        this.list.add(form3);
        return list;
    }

    public void setList(ArrayList<Rpn17008Form> list)
    {
        this.list = list;
    }
}
