package q;

/* loaded from: classes.dex */
public interface n1 {
    boolean a();

    long f(q qVar, q qVar2, q qVar3);

    q i(long j10, q qVar, q qVar2, q qVar3);

    q m(long j10, q qVar, q qVar2, q qVar3);

    default q u(q qVar, q qVar2, q qVar3) {
        return m(f(qVar, qVar2, qVar3), qVar, qVar2, qVar3);
    }
}
