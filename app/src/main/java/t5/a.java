package t5;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {
    public static final HashMap e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25643a;

    /* renamed from: b, reason: collision with root package name */
    public final File f25644b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f25645c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f25646d;

    public a(String str, File file, boolean z3) {
        File file2;
        Lock lock;
        this.f25643a = z3;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f25644b = file2;
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25645c = lock;
    }

    public final void a(boolean z3) {
        this.f25645c.lock();
        if (z3) {
            File file = this.f25644b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.f25646d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e8) {
                this.f25646d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e8);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f25646d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f25645c.unlock();
    }
}
