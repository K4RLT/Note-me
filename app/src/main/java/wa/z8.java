package wa;
import a6.c;
import g3.a;
import pa.f;
import q.x;
import q0.d;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class z8 {
    public static final LinkedHashSet a(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new c(readBoolean, parse));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        f.a(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                f.a(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        x.n(a.i("Could not convert ", i, " to BackoffPolicy"));
        return 0;
    }

    public static final int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        x.n(a.i("Could not convert ", i, " to NetworkType"));
        return 0;
    }

    public static final int d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        x.n(a.i("Could not convert ", i, " to OutOfQuotaPolicy"));
        return 0;
    }

    public static final int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        x.n(a.i("Could not convert ", i, " to State"));
        return 0;
    }

    public static final int f(int i) {
        if (i != 0) {
            int b10 = d.b(i);
            if (b10 != 0) {
                int i10 = 1;
                if (b10 != 1) {
                    i10 = 2;
                    if (b10 != 2) {
                        i10 = 3;
                        if (b10 != 3) {
                            i10 = 4;
                            if (b10 != 4) {
                                if (b10 == 5) {
                                    return 5;
                                }
                                a.o();
                                return 0;
                            }
                        }
                    }
                }
                return i10;
            }
            return 0;
        }
        throw null;
    }
}
