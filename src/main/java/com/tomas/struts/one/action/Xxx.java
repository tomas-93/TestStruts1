package com.tomas.struts.one.action;


import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Tomas Yussef
 */
public class Xxx extends MappingDispatchAction
{
    public ActionForward ejemplo1(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        System.out.println("Metodo 1");
        return mapping.findForward("ok");
    }

    public ActionForward ejemplo2(ActionMapping mapping,
                                  ActionForm form,
                                  HttpServletRequest request,
                                  HttpServletResponse response) throws Exception
    {
        System.out.println("Metodo 2");
        return mapping.findForward("ok");
    }

    public ActionForward ejemplo3(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        System.out.println("Metodo 3");
        return mapping.findForward("ok");
    }
}
