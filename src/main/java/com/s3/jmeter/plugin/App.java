package com.s3.jmeter.plugin;

import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException {
    	//String url = "https://minio-api.dev22r1.sbcp.io/sbcp-minio-bucket/core-4/other/usecaseB/1658826064308";
    	String url = "https://minio-api.dev22r1.sbcp.io/sbcp-minio-bucket/core-4/other/account-statement/1658826064308";
    	String region = "us-east-1";
    	
    	//String key = "9P4IPJX23H8IY35KU37E";
    	//String secret = "Anvuc50ypBAJC2LQltK98KYzaJMr+SKiZzgr6Y75";
    	//String token = "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJhY2Nlc3NLZXkiOiI5UDRJUEpYMjNIOElZMzVLVTM3RSIsImV4cCI6MTY1ODMwODE0NiwicGFyZW50IjoiY29yZS00Iiwic2Vzc2lvblBvbGljeSI6ImV5SnpkR0YwWlcxbGJuUWlPbHQ3SW1GamRHbHZiaUk2V3lKek16cFFkWFJQWW1wbFkzUWlYU3dpY21WemIzVnlZMlVpT2xzaVlYSnVPbUYzY3pwek16bzZPbk5pWTNBdGJXbHVhVzh0WW5WamEyVjBMMk52Y21VdE5DOXpaWEoyYVdObExXWnBiR1V0YkdsbVpXTjVZMnhsTFcxbmRDODJNbVEzWWpneU1qUTVOalExTURCaFpHUmhObUprTW1ZaVhTd2laV1ptWldOMElqb2lRV3hzYjNjaWZWMHNJblpsY25OcGIyNGlPaUl5TURFeUxURXdMVEUzSW4wPSJ9.cfi4hlvBAUOcKvL3AEAWMhNBzVyEJrOJ_vJqEI75nV2NfCAl4qGJPhyV901QgDbqoNXIQpU67DSI3rbrhX_a0A";
    	
    	String key = "minioadmin";
    	String secret = "RninwIG0Tkt3SmVi2jBT";
    	
    	//String remoteFilePath = "sbcp-minio-bucket/core-4/service-file-lifecycle-mgt/62d7b8224964500adda6bd2f";
    	String remoteFilePath = "sbcp-minio-bucket/core-4/other/account-statement/1658826064308";
    	String localFilePath1 = "C:\\sandeep\\code\\amigos\\minio-jmeter-proj\\Minio Jmeter\\environments\\testdata\\1.jpg";
    	String localFilePath2 = "c:/sandeep/1.jpg";
    	
    	String targetBucket = "sbcp-minio-bucket";
    	String from = "core-4/other/usecaseB/1658826064308";
    	String to = "core-4/other/usecaseB/myfile1.txt";

    	
    	//S3UploadUtil.uploadFile(url, region, key, secret, null, remoteFilePath, localFilePath1, null);

    	//S3UploadUtil.downloadFile(url, region, key, secret, token, remoteFilePath, localFilePath2, null);
    	
    	S3UploadUtil.uploadInfectedFile(url, region, key, secret, null, remoteFilePath, null);
    	

    	//S3UploadUtil.copyFile(url, region, key, secret, null, from, targetBucket, to, null);
    }
}
