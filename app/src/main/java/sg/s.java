package sg;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class s extends d {

    /* renamed from: j, reason: collision with root package name */
    public final Logger f25308j;

    /* renamed from: k, reason: collision with root package name */
    public final Socket f25309k;

    public s(Socket socket) {
        socket.getClass();
        this.f25309k = socket;
        this.f25308j = Logger.getLogger("okio.Okio");
    }

    @Override // sg.d
    public final IOException m(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // sg.d
    public final void n() {
        boolean z3;
        Logger logger = this.f25308j;
        Socket socket = this.f25309k;
        try {
            socket.close();
        } catch (AssertionError e) {
            boolean z9 = false;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null) {
                    z3 = mf.f.n(message, "getsockname failed");
                } else {
                    z3 = false;
                }
                if (z3) {
                    z9 = true;
                }
            }
            if (z9) {
                logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e8) {
            logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        }
    }
}
