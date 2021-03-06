package proxy.case1;

public class CommandExecutorProxy implements CommandExecutor {


    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {

        if ("Pankaj".equals(user) && "J@urnalD$v".equals(pwd))
            isAdmin = true;

        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        // 명령어 사용 권한 제한
        if (isAdmin) {
            executor.runCommand(cmd);

        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
