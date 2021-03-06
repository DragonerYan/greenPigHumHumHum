package com.company.gof23.example.chainOfResponsibility;

/**
 * 副总经理
 * @author FZ
 * @version 1.0  2015年11月13日 下午4:05:04
 */
public class ViceGeneralManager extends Leader {
	public ViceGeneralManager(String name) {
		super(name);
	}
	/**
	 * 责任链上对象对请求的具体处理
	 */
	@Override
	public void handleRequest(LeaveRequest leader) {
		if (leader.getLeaveDays()<=20) {
			System.out.println("请假人："+leader.getEmpName()+",天数："+leader.getLeaveDays()+",理由："+leader.getReason());
			System.out.println("审批人："+this.name+" 副总经理，审批通过！");
		}else{
			if (this.nextLeader != null ) {//如果有下一个继承者
				//让下一个继承者处理请求
				this.nextLeader.handleRequest(leader);
			}
		}
	}
}
