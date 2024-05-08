package lab1;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    /*public static void main(String[] args) throws Exception {
        final ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        final String requestedFile = "/mirror";
        final MirrorRequestServlet mirrorRequestServlet = new MirrorRequestServlet();
        context.addServlet(new ServletHolder(mirrorRequestServlet), requestedFile);

        final Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        System.out.println("Server started");
        server.join();*/

    public static void main(String[] args) throws Exception {
        MirrorRequestServlet mirrorRequestServlet = new MirrorRequestServlet();
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.addServlet(new ServletHolder(mirrorRequestServlet), "/mirror");

        Server server = new Server (8080);
        server.setHandler(context);

        server.start();
        System.out.println("Server started");
        server.join();
        }
}
