package it.csi.myprod.myprodsrvqrk.utils;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;


@ApplicationScoped
@Liveness
public class DBHealthChecks implements HealthCheck{
@Override
public HealthCheckResponse call() {
   
    return 
    Math.random() > 0.5 ?   HealthCheckResponse.up("Database OK") : HealthCheckResponse.down("Database KO");
}    
}
