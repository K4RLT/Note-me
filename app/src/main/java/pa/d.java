package pa;
import d.c;
import d.d;
import d.f;

import a7.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.internal.ads.oh;
import fa.y;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import n8.m;

/* loaded from: classes.dex */
public final class d {
    public static Boolean e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f22624f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f22625g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f22626h = -1;
    public static Boolean i;

    /* renamed from: m, reason: collision with root package name */
    public static i f22630m;

    /* renamed from: n, reason: collision with root package name */
    public static j f22631n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22632a;

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f22627j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final k f22628k = new k(20);

    /* renamed from: l, reason: collision with root package name */
    public static final nf.a f22629l = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final mc.c f22621b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final m f22622c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final nf.a f22623d = new Object();

    public d(Context context) {
        this.f22632a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!y.l(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 50 + str.length() + 1);
                sb3.append("Module descriptor id '");
                sb3.append(valueOf);
                sb3.append("' didn't match expected id '");
                sb3.append(str);
                sb3.append("'");
                Log.e("DynamiteModule", sb3.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(str.length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ff A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0305 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, pa.h] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.ThreadLocal, a7.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static pa.d c(android.content.Context r29, pa.c r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.c(android.content.Context, pa.c, java.lang.String):pa.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x019e, code lost:
    
        if (r4 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.d.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        int i10;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z3 = false;
        if (i == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i10 = 268435456;
            } else {
                i10 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i10);
            if (ca.f.f4036b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z3 = true;
            }
            i = Boolean.valueOf(z3);
            if (z3 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f22625g = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r6 != false) goto L92;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.oh] */
    public static void g(ClassLoader classLoader) {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof j) {
                    jVar = (j) queryLocalInterface;
                } else {
                    jVar = new oh(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 5);
                }
            }
            f22631n = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            throw new Exception("Failed to instantiate dynamite loader", e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i h(Context context) {
        i iVar;
        synchronized (d.class) {
            i iVar2 = f22630m;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof i) {
                        iVar = (i) queryLocalInterface;
                    } else {
                        iVar = new oh(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 5);
                    }
                }
                if (iVar != 0) {
                    f22630m = iVar;
                    return iVar;
                }
            } catch (Exception e8) {
                String message = e8.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f22632a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e8);
        }
    }
}
