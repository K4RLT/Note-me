package lb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: h, reason: collision with root package name */
    public static final c7.a f20192h = new c7.a("SliceMetadataManager", 5);

    /* renamed from: b, reason: collision with root package name */
    public final v f20194b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20195c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20196d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20197f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f20193a = new byte[8192];

    /* renamed from: g, reason: collision with root package name */
    public int f20198g = -1;

    public l1(v vVar, String str, int i, long j10, String str2) {
        this.f20194b = vVar;
        this.f20195c = str;
        this.f20196d = i;
        this.e = j10;
        this.f20197f = str2;
    }

    public final int a() {
        v vVar = this.f20194b;
        vVar.getClass();
        File file = new File(new File(new File(new File(vVar.d(this.f20195c, this.e, this.f20196d), "_slices"), "_metadata"), this.f20197f), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new k0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final a0 b() {
        v vVar = this.f20194b;
        vVar.getClass();
        File file = new File(new File(new File(new File(vVar.d(this.f20195c, this.e, this.f20196d), "_slices"), "_metadata"), this.f20197f), "checkpoint.dat");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null && properties.getProperty("previousChunk") != null) {
                    try {
                        int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                        String property = properties.getProperty("fileName");
                        long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                        long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                        int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                        this.f20198g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                        return new a0(parseInt, property, parseLong, parseLong2, parseInt2);
                    } catch (NumberFormatException e) {
                        throw new k0(e, "Slice checkpoint file corrupt.");
                    }
                }
                throw new k0("Slice checkpoint file corrupt.");
            } finally {
            }
        } else {
            throw new k0("Slice checkpoint file does not exist.");
        }
    }

    public final File c() {
        v vVar = this.f20194b;
        vVar.getClass();
        File file = new File(new File(new File(vVar.d(this.f20195c, this.e, this.f20196d), "_slices"), "_metadata"), this.f20197f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, this.f20198g + "-NAM.dat");
    }

    public final void d(int i, int i10, long j10, byte[] bArr) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i, i10);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f20198g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, long j10, long j11, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f20198g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(byte[] bArr, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f20198g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            v vVar = this.f20194b;
            vVar.getClass();
            File file = new File(new File(new File(new File(vVar.d(this.f20195c, this.e, this.f20196d), "_slices"), "_metadata"), this.f20197f), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void h(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f20198g));
        FileOutputStream fileOutputStream = new FileOutputStream(l());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(byte[] bArr) {
        this.f20198g++;
        v vVar = this.f20194b;
        vVar.getClass();
        File file = new File(new File(new File(vVar.d(this.f20195c, this.e, this.f20196d), "_slices"), "_metadata"), this.f20197f);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, this.f20198g + "-LFH.dat"));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            throw new k0(e, "Could not write metadata file.");
        }
    }

    public final void j(byte[] bArr, InputStream inputStream) {
        byte[] bArr2 = this.f20193a;
        this.f20198g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(bArr2);
            while (read > 0) {
                fileOutputStream.write(bArr2, 0, read);
                read = inputStream.read(bArr2);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(byte[] bArr, int i) {
        this.f20198g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final File l() {
        v vVar = this.f20194b;
        vVar.getClass();
        File file = new File(new File(new File(new File(vVar.d(this.f20195c, this.e, this.f20196d), "_slices"), "_metadata"), this.f20197f), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
