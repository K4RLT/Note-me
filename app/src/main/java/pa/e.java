package pa;
import d.i;

import android.os.Process;
import ya.cc;

/* loaded from: classes.dex */
public final class e extends Thread {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22633u = 1;

    public /* synthetic */ e(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        sg.d a10;
        switch (this.f22633u) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                synchronized (sg.d.class) {
                    try {
                        a10 = cc.a();
                        if (a10 == sg.i) {
                            sg.i = null;
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (a10 != null) {
                    a10.n();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ e(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
