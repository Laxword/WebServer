package com.webserver.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer主类
 * 
 * WebServer项目是一个网络容器，模拟开源的tomcat功能
 * 。维护若干的wevapp（网络应用），并基于TCP协议与客户端（通常是浏览器）建立连接，并使用Htt协议与客户端
 * 进行交互，使其可以访问维护的这些webapp下的资源
 * 
 * webapp网络应用通常包含一组页面，若干其他静态资源，（图片，样式文本，脚本文件，其他素材）和业务逻辑代码。
 * 我们俗称的一个网站其实就是一个网络应用。
 * @author Lax
 *
 */
public class WebServer {
	private ServerSocket server;
	public WebServer() {
		try {
			System.out.println("正在启动服务端.....");
			server = new ServerSocket(8088);
			System.out.println("服务端启动成功请开始链接客户端");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void start() {
		try {
			
			System.out.println("等待客户端连接");
			Socket socket=server.accept();
			System.out.println("成功连接上一个客户端");
			InputStream i=socket.getInputStream();
			int d=-1;
			while((d=i.read())!=1) {
				System.out.println((char)d);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		WebServer  server=new WebServer();
		server.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
