package com.project.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.project.admin.AdminIP;
import com.project.hospital.Hospital;
import com.project.medicalstaff.MedicalInfo;
import com.project.medicalstaff.Medicine;
import com.project.medicalstaff.doctor.Doctor;
import com.project.medicalstaff.nurse.Nurse;
import com.project.patient.Patient;
import com.project.patientcondition.PatientCondition;

/***
 * 
 * Data 클래스입니다. 환자, 간호사, 의사, 환자 상태 정보, 처방 정보, 병원, 관리자, 약 정보의 데이터를 가지고 있는 기능입니다.
 * @author 2조
 *
 */
public class Data {

	private final static String PATIENT;
	private final static String NURSE;
	private final static String DOCTOR;
	private final static String PATIENTCONDITION;
	private final static String MEDICALINFO;
	
	
	private final static String HOSPITAL;
	private final static String ADMINIP;
	private final static String MEDICINE;

	public static ArrayList<Patient> patientList; // == student.txt
	public static ArrayList<Doctor> doctorList; // == score.txt
	public static ArrayList<Nurse> nurseList; // == score.txt
	public static ArrayList<PatientCondition> patientconditionList; // == pc
	public static ArrayList<MedicalInfo> medicalInfoList; // == 처방 정보
	public static ArrayList<Hospital> hospitalList; // == 병원 정보
	public static ArrayList<AdminIP> adminIpList;
	public static ArrayList<Medicine> medicineList; //처방약
	

	// 정적 생성자 == 정적 멤버 초기화
	static {

		PATIENT = ".\\dat\\patient.txt";
		NURSE = ".\\dat\\nurse.txt";
		DOCTOR = ".\\dat\\doctor.txt";
		PATIENTCONDITION = ".\\dat\\patientcondition.txt";
		MEDICALINFO = ".\\dat\\medicalInfo.txt";

		HOSPITAL = ".\\dat\\hospitalinfo.txt";
		ADMINIP = ".\\dat\\admin.txt";
		MEDICINE =  ".\\dat\\medicine.txt";
		
		patientList = new ArrayList<Patient>();
		doctorList = new ArrayList<Doctor>();
		nurseList = new ArrayList<Nurse>();
		patientconditionList = new ArrayList<PatientCondition>();
		medicalInfoList = new ArrayList<MedicalInfo>();

		hospitalList = new ArrayList<Hospital>();
		adminIpList = new ArrayList<AdminIP>();
		medicineList = new ArrayList<Medicine>();
		
	}// static

	/***
	 * 메소드입니다. 환자, 환자 상태, 의사, 간호사, 진료 정보, 병원, 관리자, 약의 데이터를 불러오는 기능입니다.
	 */
	public static void load() {

		// 환자
		try {

			BufferedReader reader = new BufferedReader(new FileReader(PATIENT));

			String line = null;

			while ((line = reader.readLine()) != null) {

				//
				// %s,%s,%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%s,%d,%d
				// 개인정보이용동의여부,입원날짜 환자이름,환자나이,환자 주민등록번호,환자 성별,환자 키,환자 몸무게,환자 전화번호
				// 환자 백신 접종,유무환자기저질환,환자 주소,환자 코로나 재감염 여부,환자번호, 병실

				String[] temp = line.split(",");

				Patient p = new Patient();
	
				p.setAgreement(temp[0]);
				p.setpDate(temp[1]);
				p.setpName(temp[2]);
				p.setpAge(Integer.parseInt(temp[3]));
				p.setpJumin(temp[4]);
				p.setpGender(temp[5]);
				p.setpHeight(Double.parseDouble(temp[6]));
				p.setpWeight(Double.parseDouble(temp[7]));
				p.setpTel(temp[8]);
				p.setpVaccine(temp[9]);
				p.setpDisease(temp[10]);
				p.setpAddress(temp[11]);
				p.setpReinfection(temp[12]);
				p.setpNumber(Integer.parseInt(temp[13]));
				p.setpRoom(Integer.parseInt(temp[14]));
				p.setpConnectionpNumber(Integer.parseInt(temp[15]));


				patientList.add(p);

			} // while

			reader.close();

			// 환자 상태
			reader = new BufferedReader(new FileReader(PATIENTCONDITION));

			line = null;

			while ((line = reader.readLine()) != null) {

				// 측정날짜 ,측정시간 , 환자 체온 , 환자 최저혈압(이완기 혈압) , 환자 최고혈압(수축기 혈압) , 환자 맥박 , 환자의 산소포화도 ,
				// 기타 사항
				// 환자 번호 , 병실

				// %s,%d,%.1f,%d,%d,%d,%d,%s,%d,%d

				String[] temp = line.split(",");

				PatientCondition pc = new PatientCondition();

				pc.setPcDate(temp[0]);
				pc.setPcTime(Integer.parseInt(temp[1]));
				pc.setPcTemperature(Double.parseDouble(temp[2]));
				pc.setPcDiastolic(Integer.parseInt(temp[3]));
				pc.setPcSystolic(Integer.parseInt(temp[4]));
				pc.setPcPulse(Integer.parseInt(temp[5]));
				pc.setPcOxygen(Integer.parseInt(temp[6]));
				pc.setPcEtc(temp[7]);
				pc.setPcNumber(Integer.parseInt(temp[8]));
				pc.setPcRoom(Integer.parseInt(temp[9]));

				patientconditionList.add(pc);

			} // while

			reader.close();

			// 의사
			// 의료진 이름,의료진 나이,의료진 주민등록번호,의료진 성별,의료진 키 , 의료진 몸무게,의료진 전화번호,의료진 주소,의사면허번호
			// 의료진 담당부서 (소아 청소년과, 감염 내과)
			// %s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s
			reader = new BufferedReader(new FileReader(DOCTOR));

			line = null;

			while ((line = reader.readLine()) != null) {

				// 면허번호, 이름, 나이, 주민등록번호, 성별, 전화번호, 주소, 담당부서
				String[] temp = line.split(",");

				Doctor d = new Doctor();

				d.setdName(temp[0]);
				d.setdAge(Integer.parseInt(temp[1]));
				d.setdJumin(temp[2]);
				d.setdGender(temp[3]);

				d.setdHeight(Double.parseDouble(temp[4]));
				d.setdWeight(Double.parseDouble(temp[5]));

				d.setdTel(temp[6]);
				d.setdAddress(temp[7]);
				d.setdNumber(temp[8]);
				d.setdDepartment(temp[9]);
				d.setdConnectionNumber(Integer.parseInt(temp[10]));

				doctorList.add(d);

			} // while

			reader.close();

			// 간호사
			reader = new BufferedReader(new FileReader(NURSE));

			line = null;

			while ((line = reader.readLine()) != null) {

				// 면허번호, 이름, 나이, 주민등록번호, 성별, 전화번호, 주소, 담당부서
				String[] temp = line.split(",");

				Nurse n = new Nurse();

				n.setnName(temp[0]);
				n.setnAge(Integer.parseInt(temp[1]));
				n.setnJumin(temp[2]);
				n.setnGender(temp[3]);

				n.setnHeight(Double.parseDouble(temp[4]));
				n.setnWeight(Double.parseDouble(temp[5]));

				n.setnTel(temp[6]);
				n.setnAddress(temp[7]);
				n.setnNumber(temp[8]);
				n.setnDepartment(temp[9]);
				n.setnConnectionNumber(Integer.parseInt(temp[10]));

				nurseList.add(n);

			} // while

			reader.close();
			
	         reader = new BufferedReader(new FileReader(MEDICALINFO));
	         
	         line= null;
	         
	         while ((line = reader.readLine()) != null) {

	            // 진료일자, 진료내용, 처치, 중증도, 약, 환자고유번호
	            String[] temp = line.split(",");

	            MedicalInfo mi = new MedicalInfo();

	            mi.setmDate(temp[0]);
	            mi.setmInfo(temp[1]);
	            mi.setmResult(temp[2]);
	            mi.setmSevertity(temp[3]);
	            mi.setmMedicine(temp[4]);
	            mi.setmNumber(Integer.parseInt(temp[5]));
	            
	            medicalInfoList.add(mi);
	            
	         } // while
	         
	       reader.close();
	       
	       reader = new BufferedReader(new FileReader(HOSPITAL));
	         
	         line= null;
	         
	         while ((line = reader.readLine()) != null) {

	         
	            String[] temp = line.split(",");

	           Hospital hi = new Hospital();

	            hi.setFloor(temp[0]);
	            hi.setFacility1(temp[1]);
	            hi.setFacility2(temp[2]);
	            hi.setFacility3(temp[3]);
	            hi.setFacility4(temp[4]);
	            hi.setTel(temp[5]);
	            hi.setLocation(temp[6]);

	            
	            hospitalList.add(hi);
	            
	         } // while
	         
	         reader.close();
	         
		       reader = new BufferedReader(new FileReader(ADMINIP));
		         
		         line= null;
		         
		         while ((line = reader.readLine()) != null) {

		            // 진료일자, 진료내용, 처치, 중증도, 약, 환자고유번호
		            String[] temp = line.split(",");

		           AdminIP aip = new AdminIP();

					aip.setAdminId(temp[0]);
					aip.setAdminPw(temp[1]);

					adminIpList.add(aip);

				} // while

				reader.close();

				reader = new BufferedReader(new FileReader(MEDICINE));

				line = null;

				while ((line = reader.readLine()) != null) {
					// 처방약 종류, 처방약 명
					String[] temp = line.split(",");

					Medicine medicine = new Medicine();

					medicine.setMedicineType(temp[0]);
					medicine.setMedicine(temp[1]);

					medicineList.add(medicine);
				} // while

				reader.close();

		} catch (Exception e) {
			System.out.println("Data.load");
			e.printStackTrace();
		}

	}// load

	/***
	 * 메소드입니다. 이전 단계의 기능으로 돌아가는 기능입니다.
	 */
	public static void pause() {

		System.out.println();
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃         [0] 돌아가기              ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print("번호를 입력하세요: ");


	}

	/***
	 * 메소드입니다. 환자, 환자 상태, 의사, 간호사, 진료 정보, 병원, 관리자, 약의 데이터를 저장하는 기능입니다.
	 */
	public static void save() {

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(PATIENT));

			for (Patient p : patientList) {

				// 동의여부 ,입원 날짜,이름, 나이, 주민등록번호, 성별, 키, 몸무게, 
				// 전화번호, 백신접종유무, 기저질환, 주소, 재감염여부, 환자 번호,병실
				String data = String.format("%s,%s,%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%s,%d,%d,%d",
						p.getAgreement(),
						p.getpDate(),
						p.getpName(), 
						p.getpAge(),
						p.getpJumin(),
						p.getpGender(), 
						p.getpHeight(), 
						p.getpWeight(),
						p.getpTel(), 
						p.getpVaccine(),
						p.getpDisease(),
						p.getpAddress(),
						p.getpReinfection(),
						p.getpNumber(),
						p.getpRoom(),
						p.getpConnectionpNumber());

				writer.write(data + "\r\n");

			}

			writer.close();

			writer = new BufferedWriter(new FileWriter(PATIENTCONDITION));

			for (PatientCondition pc : patientconditionList) {

				// 측정 시간, 체온, 최저혈압, 최고혈압, 맥박, 산소포화도, 기타사항
				String data = String.format("%s,%d,%.1f,%d,%d,%d,%d,%s,%d,%d",
						pc.getPcDate(),
						pc.getPcTime(),
						pc.getPcTemperature(),
						pc.getPcDiastolic(),
						pc.getPcSystolic(), 
						pc.getPcPulse(),
						pc.getPcOxygen(), 
						pc.getPcEtc(), 
						pc.getPcNumber(),
						pc.getPcRoom());

				writer.write(data + "\r\n");

			}

			writer.close();

			writer = new BufferedWriter(new FileWriter(DOCTOR));

			for (Doctor d : doctorList) {

				// 면허번호, 이름, 나이, 주민등록번호, 성별, 전화번호, 주소, 담당부서
				String data = String.format("%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%d", 
						d.getdName(),
						d.getdAge(),
						d.getdJumin(), 
						d.getdGender(), 
						d.getdHeight(), 
						d.getdWeight(), 
						d.getdTel(),
						d.getdAddress(),
						d.getdNumber(),
						d.getdDepartment(),
						d.getdConnectionNumber());

				writer.write(data + "\r\n");

			}

			writer.close();

			writer = new BufferedWriter(new FileWriter(NURSE));

			for (Nurse n : nurseList) {

				// 면허번호, 이름, 나이, 주민등록번호, 성별, 전화번호, 주소, 담당부서
				String data = String.format("%s,%d,%s,%s,%.1f,%.1f,%s,%s,%s,%s,%d", 
						n.getnName(),
						n.getnAge(),			
						n.getnJumin(), 
						n.getnGender(),
						n.getnHeight(), 
						n.getnWeight(), 
						n.getnTel(), 
						n.getnAddress(),
						n.getnNumber(), 
						n.getnDepartment(),
						n.getnConnectionNumber());
				

				writer.write(data + "\r\n");

			}

			writer.close();
			
			writer = new BufferedWriter(new FileWriter(MEDICALINFO));

			for (MedicalInfo mi : medicalInfoList) {

//				/* %s 진료 날짜 */ "2022-09-" + (date <= 9 ? "0"+ date : date),
//				/* %s 진료 기록*/medicalrecords[rnd.nextInt(medicalrecords.length)],
//				/* %s 처치 결과*/medicalTreatment[rnd.nextInt(medicalTreatment.length)] , 
//				/* %s 중증도*/ severity[rnd.nextInt(severity.length)] , 
//				/* %s 처방약 */medicine[rnd.nextInt(medicine.length)],
//				/* %d 환자 정보*/patientNo);
				
				String data = String.format("%s,%s,%s,%s,%s,%d", 
						mi.getmDate(),
						mi.getmInfo(),			
						mi.getmResult(), 
						mi.getmSevertity(),
						mi.getmMedicine(), 

						mi.getmNumber());

				writer.write(data + "\r\n");

			}

			writer.close();
			writer = new BufferedWriter(new FileWriter(HOSPITAL));

			for (Hospital hi : hospitalList) {
				//층 , 시설명
				String data = String.format("%s,%s,%s,%s,%s,%s,%s", 
						hi.getFloor(),
						hi.getFacility1(),			
						hi.getFacility2(),			
						hi.getFacility3(),			
						hi.getFacility4(),
						hi.getTel(),
						hi.getLocation());


				writer.write(data + "\r\n");

			}

			writer.close();
			
			writer = new BufferedWriter(new FileWriter(ADMINIP));

			for (AdminIP aip : adminIpList) {
				//층 , 시설명
				String data = String.format("%s,%s", 
						aip.getAdminId(),
						aip.getAdminPw());		
			

				writer.write(data + "\r\n");

			}

			writer.close();

			writer = new BufferedWriter(new FileWriter(MEDICINE));

			for (Medicine medicine : medicineList) {
				// 처방약 종류, 처방약
				String data = String.format("%s,%s", medicine.getMedicineType(), medicine.getMedicine());

				writer.write(data + "\r\n");

			}

			writer.close();

		} catch (Exception e) {
			System.out.println("Data.save");
			e.printStackTrace();
		}

	}
		
}// Data
